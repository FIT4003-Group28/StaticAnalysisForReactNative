package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: njv  reason: default package */
/* loaded from: classes3.dex */
public final class njv extends njo implements AdapterView.OnItemClickListener, jyj {
    private avwa[] ae;
    private int af;
    private aial ag;

    private static void aK(Context context, akav akavVar, avwa[] avwaVarArr, int i) {
        int i2 = 0;
        while (i2 < avwaVarArr.length) {
            nji njiVar = new nji(context, avwaVarArr[i2]);
            njiVar.a(i2 == i);
            akavVar.add(njiVar);
            i2++;
        }
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        dismiss();
    }

    @Override // defpackage.jyj
    public final void a(aial aialVar) {
        this.ag = aialVar;
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        akav akavVar = new akav(mJ());
        aK(mJ(), akavVar, this.ae, this.af);
        return akavVar;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    @Override // defpackage.jyj
    public final void b(avwa[] avwaVarArr, int i) {
        if (this.ae == avwaVarArr && this.af == i) {
            return;
        }
        this.ae = avwaVarArr;
        this.af = i;
        akav akavVar = (akav) this.aC;
        dt mJ = mJ();
        if (mJ == null || akavVar == null || !at()) {
            return;
        }
        akavVar.clear();
        aK(mJ, akavVar, avwaVarArr, i);
        akavVar.notifyDataSetChanged();
    }

    @Override // defpackage.jyj
    public final void c(dt dtVar) {
        if (ap() || at()) {
            return;
        }
        qv(dtVar.getSupportFragmentManager(), "PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        aial aialVar = this.ag;
        aian aianVar = (aian) aialVar;
        aianVar.a.F(((nji) ((akav) this.aC).getItem(i)).a);
        aianVar.c(ahgh.d(aianVar.b));
        dismiss();
    }
}
