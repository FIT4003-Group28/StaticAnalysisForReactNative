package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LibraryState implements Item {
    @dgto(a = "can_save")
    public final boolean canAdd;
    @dgto(a = "saved")
    public final boolean isAdded;
    @dgto(a = "uri")
    public final String uri;

    private LibraryState() {
        this(null, false, false);
    }

    public LibraryState(String str, boolean z, boolean z2) {
        this.uri = str;
        this.isAdded = z;
        this.canAdd = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LibraryState libraryState = (LibraryState) obj;
        if (this.isAdded != libraryState.isAdded || this.canAdd != libraryState.canAdd) {
            return false;
        }
        String str = this.uri;
        String str2 = libraryState.uri;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.uri;
        return ((((str != null ? str.hashCode() : 0) * 31) + (this.isAdded ? 1 : 0)) * 31) + (this.canAdd ? 1 : 0);
    }

    public String toString() {
        String str = this.uri;
        boolean z = this.isAdded;
        boolean z2 = this.canAdd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("LibraryState{uri='");
        sb.append(str);
        sb.append('\'');
        sb.append(", isAdded=");
        sb.append(z);
        sb.append(", canAdd=");
        sb.append(z2);
        sb.append('}');
        return sb.toString();
    }
}
