package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsnd  reason: default package */
/* loaded from: classes4.dex */
public class bsnd implements bsmy {
    private final String a;
    private final List<bsmz> b = new ArrayList();
    private final cjtd c;
    private final View.OnAttachStateChangeListener d;

    public bsnd(bsng bsngVar, bsnb bsnbVar, huc hucVar, djrs djrsVar, ddho ddhoVar, ddho ddhoVar2, boolean z) {
        this.a = djrsVar.b;
        this.c = cjtd.a(ddhoVar);
        int size = djrsVar.a.size();
        for (int i = 0; i < size; i++) {
            djrm djrmVar = djrsVar.a.get(i);
            if (z) {
                List<bsmz> list = this.b;
                dxio a = ((dxjh) bsnbVar.a).a();
                bsnb.a(a, 1);
                bsnb.a(djrmVar, 2);
                bsnb.a(ddhoVar2, 4);
                list.add(new bsna(a, djrmVar, i, ddhoVar2));
            } else {
                List<bsmz> list2 = this.b;
                btvo a2 = bsngVar.a.a();
                bsng.a(a2, 1);
                Resources a3 = bsngVar.b.a();
                bsng.a(a3, 2);
                bsmd a4 = bsngVar.c.a();
                bsng.a(a4, 3);
                bsng.a(djrmVar, 4);
                bsng.a(ddhoVar2, 6);
                list2.add(new bsnf(a2, a3, a4, djrmVar, i, ddhoVar2));
            }
        }
        this.d = hucVar.a(new htz(this) { // from class: bsnc
            private final bsnd a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.c();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        });
    }

    @Override // defpackage.bsmy
    public List<bsmz> a() {
        return this.b;
    }

    @Override // defpackage.bsmy
    public String b() {
        return this.a;
    }

    @Override // defpackage.bsmy
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.bsmy
    public View.OnAttachStateChangeListener d() {
        return this.d;
    }
}
