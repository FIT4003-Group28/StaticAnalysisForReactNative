package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ulq  reason: default package */
/* loaded from: classes4.dex */
final class ulq extends qn {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public ulq(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.qn
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.qn
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.qn
    public final boolean c(int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        str = ((ulx) obj).c;
        str2 = ((ulx) obj2).c;
        if (akzj.f(str, str2)) {
            str3 = ((ulx) obj).b;
            str4 = ((ulx) obj2).b;
            return akzj.f(str3, str4);
        }
        return false;
    }

    @Override // defpackage.qn
    public final boolean d(int i, int i2) {
        String str;
        String str2;
        str = ((ulx) this.a.get(i)).c;
        str2 = ((ulx) this.b.get(i2)).c;
        return str.equals(str2);
    }
}
