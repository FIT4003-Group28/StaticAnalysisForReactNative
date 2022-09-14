package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MotionState implements Item {
    public static final int DETECTED = 2;
    public static final int DETECTING = 1;
    public static final int ERROR = 3;
    public static final int INITIAL = 0;
    public static final int SKIPPED = 4;
    public static final int UNKNOWN = -1;
    @dgto(a = "state")
    public final int state;

    private MotionState() {
        this(-1);
    }

    public MotionState(int i) {
        this.state = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.state == ((MotionState) obj).state;
    }

    public int hashCode() {
        return this.state;
    }

    public String toString() {
        int i = this.state;
        StringBuilder sb = new StringBuilder(30);
        sb.append("MotionState{state=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
