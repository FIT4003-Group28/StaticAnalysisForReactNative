package defpackage;

import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: hxn  reason: default package */
/* loaded from: classes3.dex */
final class hxn implements afzf {
    final /* synthetic */ hxo a;
    private final arqn b;

    public hxn(hxo hxoVar, arqn arqnVar) {
        this.a = hxoVar;
        this.b = arqnVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zag.q(this.a.a, R.string.delete_reel_item_failed, 1);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arqo arqoVar = (arqo) obj;
        ifm ifmVar = this.a.d;
        arqn arqnVar = this.b;
        ListIterator listIterator = ifmVar.a.listIterator();
        while (listIterator.hasNext()) {
            ifl iflVar = (ifl) ((WeakReference) listIterator.next()).get();
            if (iflVar != null) {
                iflVar.aS(arqnVar, arqoVar);
            } else {
                listIterator.remove();
            }
        }
        zag.q(this.a.a, R.string.delete_reel_item_succeed, 1);
    }
}
