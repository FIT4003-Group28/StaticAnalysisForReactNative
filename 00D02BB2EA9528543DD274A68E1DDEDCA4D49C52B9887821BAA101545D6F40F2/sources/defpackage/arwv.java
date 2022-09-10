package defpackage;

import com.spotify.protocol.types.ListItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arwv  reason: default package */
/* loaded from: classes2.dex */
public final class arwv {
    public final arwu a;
    public final int b;
    public int c = 0;
    public final List<ListItem> d = new ArrayList();
    public final List<ListItem> e = new ArrayList();
    public final List<ListItem> f = new ArrayList();
    public final dxfp g;

    private arwv(dxfp dxfpVar, arwu arwuVar, int i) {
        this.g = dxfpVar;
        this.a = arwuVar;
        this.b = i;
    }

    public static void b(dxfp dxfpVar, arwu arwuVar, int i) {
        arwv arwvVar = new arwv(dxfpVar, arwuVar, i);
        if (arwvVar.c > 0) {
            return;
        }
        if (!arwvVar.f.isEmpty()) {
            arwvVar.a.a(dcdc.r(arwvVar.f));
            return;
        }
        arwvVar.g.a(dxex.DEFAULT).c(arwvVar.a(new arws(arwvVar)));
        arwvVar.g.a(dxex.NAVIGATION).c(arwvVar.a(new arwt(arwvVar, arwvVar.e)));
    }

    public final <T> dxgk<T> a(final dxgk<T> dxgkVar) {
        this.c++;
        return new dxgk(this, dxgkVar) { // from class: arwr
            private final arwv a;
            private final dxgk b;

            {
                this.a = this;
                this.b = dxgkVar;
            }

            @Override // defpackage.dxgk
            public final void a(Object obj) {
                arwv arwvVar = this.a;
                arwvVar.c--;
                this.b.a(obj);
            }
        };
    }
}
