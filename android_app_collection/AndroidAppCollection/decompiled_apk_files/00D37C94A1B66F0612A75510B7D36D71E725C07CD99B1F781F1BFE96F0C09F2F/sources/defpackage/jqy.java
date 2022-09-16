package defpackage;

import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: jqy  reason: default package */
/* loaded from: classes3.dex */
final class jqy implements yiw {
    final /* synthetic */ jqz a;

    public jqy(jqz jqzVar) {
        this.a = jqzVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        List<agqv> list = (List) obj2;
        if (this.a.r.isCancelled() || !str.equals(this.a.p)) {
            return;
        }
        long j = 2147483647L;
        for (agqv agqvVar : list) {
            agqu agquVar = agqvVar.j;
            long i = nni.i(agquVar, this.a.g);
            if (agquVar != null && i < j && nni.s(agquVar)) {
                j = i;
            }
        }
        if (j == 2147483647L || j == 0) {
            return;
        }
        jqz jqzVar = this.a;
        jjj jjjVar = new jjj(R.attr.ytTextDisabled, nni.p(jqzVar.h.a, j, false));
        zag.o(jqzVar.j, false);
        zag.m(jqzVar.i, jjjVar.c[0]);
        jqzVar.i.setTextColor(zhn.j(jqzVar.a, jjjVar.a).orElse(0));
        jqzVar.i.setTypeface(jqzVar.j.getTypeface(), 0);
    }
}
