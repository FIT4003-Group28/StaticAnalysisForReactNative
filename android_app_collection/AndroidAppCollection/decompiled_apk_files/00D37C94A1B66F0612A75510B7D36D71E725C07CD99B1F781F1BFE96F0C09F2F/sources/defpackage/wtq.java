package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: wtq  reason: default package */
/* loaded from: classes4.dex */
public final class wtq implements wlk, wuj {
    public PlayerResponseModel b;
    public final azqb c;
    private aika f;
    private final azqb g;
    final List e = new ArrayList();
    public final List d = new ArrayList();
    public String a = "";

    public wtq(azqb azqbVar, azqb azqbVar2) {
        this.c = azqbVar;
        this.g = azqbVar2;
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        this.a = str;
        this.f = aikaVar;
        this.b = playerResponseModel;
        if (aikaVar == aika.NEW) {
            this.d.clear();
            this.e.clear();
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wuj
    public final void i(xdu xduVar) {
        ArrayList arrayList = new ArrayList(this.d.size());
        arrayList.addAll(this.d);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wtp wtpVar = (wtp) arrayList.get(i);
            if (xduVar == null) {
                wwf.a(null, "Provided onSlotUnscheduled() param was null");
            } else if (wtpVar == null) {
                wwf.a(null, "Slot bundle was null");
            } else if (TextUtils.equals(wtpVar.a.a, xduVar.a)) {
                this.e.add(wtpVar);
                this.d.remove(wtpVar);
            }
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        if (this.f == aika.VIDEO_PLAYING && !this.e.isEmpty() && TextUtils.equals(this.a, str)) {
            ArrayList arrayList = new ArrayList(this.e.size());
            arrayList.addAll(this.e);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final wtp wtpVar = (wtp) arrayList.get(i);
                if (wtpVar.d) {
                    if (!wtpVar.b.a(j)) {
                        this.e.remove(wtpVar);
                        ((wtm) this.g.get()).a(10, wtpVar.c, new wtl() { // from class: wto
                            @Override // defpackage.wtl
                            public final List a() {
                                return Arrays.asList(wtp.this.a);
                            }
                        });
                    }
                } else if (wtpVar.b.a(j)) {
                    wtpVar.d = true;
                }
            }
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
