package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: wgh  reason: default package */
/* loaded from: classes4.dex */
public class wgh {
    private final wgg a;
    private final boolean b;
    private final apzg c;

    public wgh(wgg wggVar, boolean z) {
        this(wggVar, z, null);
    }

    public wgh(wgg wggVar, boolean z, apzg apzgVar) {
        this.a = wggVar;
        this.b = z;
        this.c = apzgVar;
    }

    public wgg a() {
        return this.a;
    }

    public apzg b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wgh)) {
            return false;
        }
        wgh wghVar = (wgh) obj;
        return this.b == wghVar.b && this.a == wghVar.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }
}
