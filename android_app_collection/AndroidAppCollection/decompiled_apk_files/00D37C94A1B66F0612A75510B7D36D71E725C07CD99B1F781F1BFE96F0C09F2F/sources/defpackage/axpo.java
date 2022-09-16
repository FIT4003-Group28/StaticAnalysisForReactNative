package defpackage;
/* compiled from: PG */
/* renamed from: axpo  reason: default package */
/* loaded from: classes2.dex */
public final class axpo extends Exception {
    private static final long serialVersionUID = 6569838532917408380L;
    public final axpm a;

    public axpo(axpm axpmVar, String str) {
        super(str);
        this.a = axpmVar;
    }

    public axpo(axpm axpmVar, String str, Exception exc) {
        super(str, exc);
        this.a = axpmVar;
    }
}
