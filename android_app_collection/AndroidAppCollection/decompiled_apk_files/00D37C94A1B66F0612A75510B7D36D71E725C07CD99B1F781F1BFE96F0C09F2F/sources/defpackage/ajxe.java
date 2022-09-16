package defpackage;
/* compiled from: PG */
/* renamed from: ajxe  reason: default package */
/* loaded from: classes.dex */
public class ajxe implements ajxf {
    private static final ajxe a = new ajxe();
    private final ampq b;

    private ajxe() {
        this.b = amon.a;
    }

    public ajxe(ajfz ajfzVar) {
        this.b = ampq.j(ajfzVar);
    }

    public static ajxe a() {
        return a;
    }

    public ampq b() {
        return this.b;
    }

    public boolean c() {
        return this.b.h() && ((ajfz) this.b.c()).a() == ajfy.RELOAD;
    }

    public boolean d() {
        return c() && ((ajfz) this.b.c()).c();
    }
}
