package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ude  reason: default package */
/* loaded from: classes4.dex */
public final class ude {
    public final udd a;

    public ude(udd uddVar) {
        this.a = uddVar;
    }

    private static final vfm e() {
        vfm b = vfm.b();
        b.c("reference");
        b.d("& ? > 0", 1L);
        return b;
    }

    public final List a(String str) {
        return this.a.a(str, amuk.r(e().a()));
    }

    public final List b(String str, String str2) {
        vfm e = e();
        e.c(" AND ");
        e.c("group_id");
        e.d("=?", str2);
        return this.a.a(str, amuk.r(e.a()));
    }

    public final List c(String str, String... strArr) {
        return this.a.a(str, uid.g(e().a(), "thread_id", strArr));
    }

    public final void d(String str, String... strArr) {
        this.a.b(str, uid.g(null, "thread_id", strArr));
    }
}
