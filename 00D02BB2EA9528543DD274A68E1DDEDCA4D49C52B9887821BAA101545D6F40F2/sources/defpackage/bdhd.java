package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bdhd  reason: default package */
/* loaded from: classes3.dex */
public final class bdhd extends bdhk {
    public final Map<String, String> a;
    private final bdhg b;

    public bdhd(Map<String, String> map, @dzsi bdhg bdhgVar) {
        if (map != null) {
            this.a = map;
            this.b = bdhgVar;
            return;
        }
        throw new NullPointerException("Null selectedPhoto");
    }

    @Override // defpackage.bdhk
    public final Map<String, String> a() {
        return this.a;
    }

    @Override // defpackage.bdhk
    @dzsi
    public final bdhg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        bdhg bdhgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhk) {
            bdhk bdhkVar = (bdhk) obj;
            if (this.a.equals(bdhkVar.a()) && ((bdhgVar = this.b) != null ? bdhgVar.equals(bdhkVar.b()) : bdhkVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        bdhg bdhgVar = this.b;
        return hashCode ^ (bdhgVar == null ? 0 : bdhgVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
        sb.append("PhotoSelectionResult{selectedPhoto=");
        sb.append(valueOf);
        sb.append(", photoPickerOption=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
