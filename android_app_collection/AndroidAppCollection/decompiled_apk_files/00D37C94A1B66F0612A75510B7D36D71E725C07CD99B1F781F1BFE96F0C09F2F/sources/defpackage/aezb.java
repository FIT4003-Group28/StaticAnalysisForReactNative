package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aezb  reason: default package */
/* loaded from: classes.dex */
public abstract class aezb implements ppy, prj {
    protected final PlayerConfigModel a;
    protected final VideoStreamingData b;
    protected final String c;
    protected final aeyq d;
    protected final afjm e;
    protected final pnp f;
    protected final pnj g;
    protected final atk h;
    protected ppx i;
    protected final pjc j;
    protected prx[] k;
    private final TrackGroupArray l;
    private final afbk[] m;
    private final pqh n;
    private final afbq o;
    private ppm p;
    private final axf q;

    /* JADX INFO: Access modifiers changed from: protected */
    public aezb(afjm afjmVar, pnp pnpVar, pnj pnjVar, atk atkVar, pqh pqhVar, axf axfVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aeyq aeyqVar, String str, pjc pjcVar, afbq afbqVar) {
        afms.b(!videoStreamingData.p.isEmpty());
        this.a = playerConfigModel;
        this.b = videoStreamingData;
        this.c = str;
        this.d = aeyqVar;
        this.e = afjmVar;
        this.f = pnpVar;
        this.g = pnjVar;
        this.h = atkVar;
        List<FormatStreamModel> list = videoStreamingData.p;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (FormatStreamModel formatStreamModel : list) {
            Format m = formatStreamModel.m();
            Format c = m.c(pnpVar.c(m));
            if (formatStreamModel.C()) {
                arrayList.add(c);
                arrayList3.add(formatStreamModel);
            } else if (formatStreamModel.P()) {
                arrayList2.add(c);
                arrayList4.add(formatStreamModel);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList5.add(new TrackGroup((Format[]) arrayList.toArray(new Format[0])));
            arrayList6.add(new afbk(1, (FormatStreamModel[]) arrayList3.toArray(new FormatStreamModel[0])));
        }
        if (!arrayList2.isEmpty()) {
            arrayList5.add(new TrackGroup((Format[]) arrayList2.toArray(new Format[0])));
            arrayList6.add(new afbk(2, (FormatStreamModel[]) arrayList4.toArray(new FormatStreamModel[0])));
        }
        if (arrayList5.isEmpty() || arrayList6.isEmpty()) {
            afkj.d(afki.MFL, "ManifestlessMediaPeriod has no playable tracks");
        }
        Pair pair = new Pair(new TrackGroupArray((TrackGroup[]) arrayList5.toArray(new TrackGroup[0])), (afbk[]) arrayList6.toArray(new afbk[0]));
        this.l = (TrackGroupArray) pair.first;
        this.m = (afbk[]) pair.second;
        this.n = pqhVar;
        this.q = axfVar;
        this.j = pjcVar;
        this.k = new prx[0];
        this.p = new ppm(this.k);
        this.o = afbqVar;
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        return j;
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        r();
    }

    protected abstract pry c(afbk afbkVar, pvf pvfVar);

    @Override // defpackage.ppy, defpackage.prk
    public final long d() {
        return this.p.d();
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        return this.p.e();
    }

    @Override // defpackage.ppy
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ppy
    public final long g(long j) {
        for (prx prxVar : this.k) {
            prxVar.g(j);
        }
        return j;
    }

    @Override // defpackage.ppy
    public final long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        pvf[] pvfVarArr2 = pvfVarArr;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (i < pvfVarArr2.length) {
            pvf pvfVar = pvfVarArr2[i];
            pri priVar = priVarArr[i];
            if (priVar instanceof prx) {
                prx prxVar = (prx) priVar;
                if (pvfVar == null || !zArr[i]) {
                    afki afkiVar = afki.ABR;
                    int i2 = prxVar.a;
                    q(prxVar.b);
                    prxVar.i();
                    priVarArr[i] = null;
                } else {
                    sparseArray.put(this.l.a(pvfVar.p()), prxVar);
                }
            }
            if (priVarArr[i] == null && pvfVar != null) {
                int a = this.l.a(pvfVar.p());
                afbk afbkVar = this.m[a];
                afki afkiVar2 = afki.ABR;
                int i3 = afbkVar.a;
                prx prxVar2 = new prx(afbkVar.a, c(afbkVar, pvfVar), this, this.q, j, this.f, this.g, this.o.a(new aeza(this, 1), new aeza(this)), this.n);
                sparseArray.put(a, prxVar2);
                priVarArr[i] = prxVar2;
                zArr2[i] = true;
            }
            i++;
            pvfVarArr2 = pvfVarArr;
        }
        this.k = new prx[sparseArray.size()];
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            this.k[i4] = (prx) sparseArray.valueAt(i4);
        }
        this.p = new ppm(this.k);
        return j;
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        return this.l;
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        for (prx prxVar : this.k) {
            prxVar.f(j, z);
        }
    }

    @Override // defpackage.ppy
    public final void k() {
    }

    @Override // defpackage.ppy
    public final void l(ppx ppxVar, long j) {
        this.i = ppxVar;
        ppxVar.c(this);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
        this.p.m(j);
    }

    public final void n() {
        for (prx prxVar : this.k) {
            prxVar.i();
        }
    }

    @Override // defpackage.ppy, defpackage.prk
    public boolean o(long j) {
        return this.p.o(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        return this.p.p();
    }

    protected abstract void q(pry pryVar);

    public final void r() {
        ppx ppxVar = this.i;
        if (ppxVar != null) {
            ppxVar.b(this);
        }
    }
}
