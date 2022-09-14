package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: arhx  reason: default package */
/* loaded from: classes2.dex */
public class arhx implements arib {
    private final Application a;
    private final arhw b;
    private final dcdc<aric> c;
    private final bbb d = new arhv(this);
    private int e;

    public arhx(Application application, arhz arhzVar, arhw arhwVar, List<dvbv> list) {
        this.a = application;
        this.b = arhwVar;
        this.c = arhzVar.a(list);
        b(0);
    }

    @Override // defpackage.arib
    public List<aric> a() {
        return this.c;
    }

    public final void b(int i) {
        this.e = i;
        arhw arhwVar = this.b;
        String string = this.a.getString(R.string.MY_MAPS_PAGING_INFO, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.c.size())});
        arhi arhiVar = ((arhh) arhwVar).a;
        jhz e = arhiVar.a.e();
        e.a = string;
        arhiVar.q(e.b());
    }

    @Override // defpackage.arib
    public Integer c() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.arib
    public bbb d() {
        return this.d;
    }

    @Override // defpackage.arib
    public cjtd e() {
        return cjtd.a(dtxv.ey);
    }
}
