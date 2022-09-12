package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bowr  reason: default package */
/* loaded from: classes3.dex */
public class bowr implements Serializable {
    public final Boolean a;
    public final Boolean b;
    public Boolean c;

    public bowr(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
        this.c = bool2;
    }

    public final boolean a() {
        return !this.b.equals(this.c);
    }
}
