package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: arep  reason: default package */
/* loaded from: classes2.dex */
public final class arep implements btzi<dvcd, dvch> {
    private static final dcqe k = dcqe.c("arep");
    public final ff a;
    public final bwqv b;
    public final dvcd c;
    public final arja d;
    public final bwrs<arfk> e;
    public arad f;
    public btzc g;
    @dzsi
    public arhf h;
    final bwrr<arfk> i = new areo(this);
    public final butt j;
    private final alar l;
    private final String m;

    public arep(ff ffVar, bwqv bwqvVar, butt buttVar, alar alarVar, arja arjaVar, bwrs bwrsVar, arad aradVar) {
        String str;
        this.a = ffVar;
        this.b = bwqvVar;
        this.j = buttVar;
        this.l = alarVar;
        this.d = arjaVar;
        this.f = aradVar;
        this.e = bwrsVar;
        dvcx e = ((arfk) bwrsVar.c()).e();
        String str2 = "";
        if (e == null) {
            this.m = str2;
            this.c = dvcd.e;
        } else {
            dvcr dvcrVar = e.b;
            String str3 = (dvcrVar == null ? dvcr.h : dvcrVar).b;
            dvcr dvcrVar2 = e.b;
            dsrj<dvcl> dsrjVar = (dvcrVar2 == null ? dvcr.h : dvcrVar2).e;
            String str4 = alarVar.c;
            Iterator<dvcl> it = dsrjVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bvoo.h("Feature has specified geoAssetId %s, but there is no corresponding layer in the current map.", str4);
                    str = str2;
                    break;
                }
                dvcl next = it.next();
                dxdm dxdmVar = next.b;
                if ((dxdmVar == null ? dxdm.e : dxdmVar).d.equals(str4)) {
                    str = next.e;
                    break;
                }
            }
            this.m = str;
            dvcc bZ = dvcd.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvcd dvcdVar = (dvcd) bZ.b;
            dvcdVar.d = 1;
            dvcdVar.a |= 4;
            dvca bZ2 = dvcb.d.bZ();
            String str5 = alarVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvcb dvcbVar = (dvcb) bZ2.b;
            str5.getClass();
            dvcbVar.a |= 2;
            dvcbVar.c = str5;
            dxdl bZ3 = dxdm.e.bZ();
            String str6 = alarVar.c;
            Iterator<dvcl> it2 = dsrjVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    bvoo.h("No geoAssetId \"%s\" in the current map.", str6);
                    break;
                }
                dvcl next2 = it2.next();
                dxdm dxdmVar2 = next2.b;
                if ((dxdmVar2 == null ? dxdm.e : dxdmVar2).d.equals(str6)) {
                    dxdm dxdmVar3 = next2.b;
                    str2 = (dxdmVar3 == null ? dxdm.e : dxdmVar3).b;
                }
            }
            String replaceFirst = alarVar.a.replaceFirst("[^|]*", str2);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dxdm dxdmVar4 = (dxdm) bZ3.b;
            replaceFirst.getClass();
            dxdmVar4.a |= 1;
            dxdmVar4.b = replaceFirst;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvcb dvcbVar2 = (dvcb) bZ2.b;
            dxdm bK = bZ3.bK();
            bK.getClass();
            dvcbVar2.b = bK;
            dvcbVar2.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvcd dvcdVar2 = (dvcd) bZ.b;
            dvcb bK2 = bZ2.bK();
            bK2.getClass();
            dsrj<dvcb> dsrjVar2 = dvcdVar2.c;
            if (!dsrjVar2.a()) {
                dvcdVar2.c = dsqw.cl(dsrjVar2);
            }
            dvcdVar2.c.add(bK2);
            this.c = bZ.bK();
            str2 = str3;
        }
        arjaVar.a(str2, this.m);
    }

    private final void f(@dzsi dvch dvchVar, @dzsi bttq bttqVar) {
        if (dvchVar == null || bttqVar != null) {
            g();
        } else if (dvchVar.a.size() == 1) {
            dvbt dvbtVar = dvchVar.a.get(0);
            int a = dvcg.a(dvbtVar.a);
            if (a == 0 || a != 2) {
                int i = dvbtVar.a;
                g();
                return;
            }
            akra akraVar = this.l.r;
            dvcj dvcjVar = dvbtVar.b;
            if (dvcjVar == null) {
                dvcjVar = dvcj.d;
            }
            this.h = new arhf(akraVar, dvcjVar);
            if (this.f != null && this.l.a()) {
                this.f.a(this.h);
                this.f.f();
            }
            this.d.b(this.h);
        } else {
            bvoo.h("Got %d feature details, only expected 1!", Integer.valueOf(dvchVar.a.size()));
            g();
        }
    }

    private final void g() {
        Toast.makeText(this.a, (int) R.string.NET_FAIL_TITLE, 1).show();
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvcd> btzrVar, btzy btzyVar) {
        if (btzyVar.p == bttq.CANCELED) {
            return;
        }
        f(null, btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvcd> btzrVar, dvch dvchVar) {
        f(dvchVar, null);
    }

    public final void c() {
        if (!d()) {
            this.a.g().e();
        }
    }

    public final boolean d() {
        return this.e.c().c == arfj.MAP_LOADED && this.e.c().d(this.l.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e(dvcd dvcdVar) {
        String valueOf = String.valueOf(dvcdVar.b);
        return valueOf.length() != 0 ? "key_".concat(valueOf) : new String("key_");
    }
}
