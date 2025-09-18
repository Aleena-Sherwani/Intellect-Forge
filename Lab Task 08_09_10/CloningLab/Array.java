package CloningLab;
class Array implements Cloneable {
    int[] value;

    public Array(int size) {
        value = new int[size];
        for (int i = 0; i < size; i++) {
            value[i] = i + 1;
        }
    }

    public void increment() {
        for (int i = 0; i < value.length; i++) {
            value[i]++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < value.length; i++) {
            sb.append(value[i]);
            if (i < value.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // ---- Shallow Copy ----
    public Array shallowClone() throws CloneNotSupportedException {
        return (Array) super.clone();  // copies only reference
    }

    // ---- Deep Copy ----
    public Array deepClone() throws CloneNotSupportedException {
        Array copy = (Array) super.clone();
        copy.value = value.clone();  // makes new array
        return copy;
    }
}