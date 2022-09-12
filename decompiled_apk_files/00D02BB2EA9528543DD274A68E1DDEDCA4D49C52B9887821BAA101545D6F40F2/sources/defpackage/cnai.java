package defpackage;
/* compiled from: PG */
/* renamed from: cnai  reason: default package */
/* loaded from: classes5.dex */
public class cnai extends Exception {
    public final ddid a;

    public cnai(ddid ddidVar, String str) {
        super(str);
        this.a = ddidVar;
    }

    public cnai(ddid ddidVar, String str, Throwable th) {
        super(str, th);
        this.a = ddidVar;
    }
}
