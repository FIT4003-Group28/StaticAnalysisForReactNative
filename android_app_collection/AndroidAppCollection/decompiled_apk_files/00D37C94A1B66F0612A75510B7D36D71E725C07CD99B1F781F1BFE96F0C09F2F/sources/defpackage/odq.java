package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: odq  reason: default package */
/* loaded from: classes3.dex */
public final class odq extends akaq {
    private final aari a;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final odm g;
    private final xmm h;
    private final lok i;
    private final loh j;
    private final lnn k;
    private final Context l;
    private final ajin m;
    private final ajin n;
    private final yni o;
    private final ajyi p;
    private final ampq q;

    public odq(Context context, iue iueVar, yni yniVar, ajyi ajyiVar, yzj yzjVar, acti actiVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, odm odmVar, xmm xmmVar, lok lokVar, lnn lnnVar, ajin ajinVar, ajin ajinVar2, ampq ampqVar, ajxu ajxuVar, loh lohVar) {
        super(iueVar, yniVar, ajyiVar, yzjVar, actiVar, ajxuVar);
        this.l = context;
        this.o = yniVar;
        this.p = ajyiVar;
        this.a = iueVar;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.g = odmVar;
        this.h = xmmVar;
        this.i = lokVar;
        this.k = lnnVar;
        this.m = ajinVar;
        this.n = ajinVar2;
        this.j = lohVar;
        this.q = ampqVar;
    }

    @Override // defpackage.akaq, defpackage.ajyk
    public final ajyj a(Object obj, akam akamVar, akaf akafVar) {
        arew arewVar;
        ajyq ajyqVar;
        if (obj instanceof aakq) {
            aakq aakqVar = (aakq) obj;
            if (xml.y(aakqVar)) {
                ajyqVar = this.h.a(this.a, this.c, akamVar);
            } else if (!odh.r(aakqVar)) {
                if (aakqVar == null || !oaw.c(aakqVar.a)) {
                    ajyqVar = (ajyq) this.d.get();
                } else {
                    ajyqVar = (ajyq) this.f.get();
                }
            } else {
                ajyqVar = (ajyq) this.e.get();
            }
            ajyqVar.i(aakqVar);
            ajyqVar.lA().mG(new ajxv(this.b));
            return ajyqVar;
        } else if (obj instanceof auxn) {
            return this.g.a((auxn) obj);
        } else {
            if (obj instanceof auuf) {
                auuf auufVar = (auuf) obj;
                auuh auuhVar = auufVar.r;
                if (auuhVar == null) {
                    auuhVar = auuh.a;
                }
                if ((auuhVar.b & 2) != 0) {
                    auuh auuhVar2 = auufVar.r;
                    if (auuhVar2 == null) {
                        auuhVar2 = auuh.a;
                    }
                    arex arexVar = auuhVar2.d;
                    if (arexVar == null) {
                        arexVar = arex.a;
                    }
                    loh lohVar = this.j;
                    if ((arexVar.b & 1024) != 0) {
                        arewVar = arexVar.g;
                        if (arewVar == null) {
                            arewVar = arew.a;
                        }
                    } else {
                        arewVar = null;
                    }
                    lohVar.b = arewVar;
                    lohVar.a = arexVar.e;
                    lohVar.c(loh.b(this.l));
                    if ((arexVar.b & 128) != 0) {
                        arez arezVar = arexVar.f;
                        if (arezVar == null) {
                            arezVar = arez.a;
                        }
                        int a = arey.a(arezVar.b);
                        if (a != 0 && a == 4) {
                            return this.k.a(auufVar, arexVar, lohVar, akamVar);
                        }
                    }
                    loj a2 = this.i.a(auufVar, arexVar, lohVar, akamVar);
                    int dimensionPixelSize = this.l.getResources().getDimensionPixelSize(R.dimen.watch_next_horizontal_grid_padding);
                    a2.d.mG(new ajqy(dimensionPixelSize, dimensionPixelSize));
                    return a2;
                }
            }
            if (obj instanceof aakp) {
                auuf auufVar2 = ((aakp) obj).a;
                return new odc(this.p, this.o, auufVar2, aolu.k(auufVar2), this.b, this.m, this.q, akamVar);
            } else if (obj instanceof aald) {
                auuf auufVar3 = ((aald) obj).a;
                return new odg(this.p, this.o, auufVar3, aolu.l(auufVar3), this.n, akamVar);
            } else {
                return super.a(obj, akamVar, akafVar);
            }
        }
    }
}
