package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jkd  reason: default package */
/* loaded from: classes3.dex */
public final class jkd implements AdapterView.OnItemSelectedListener {
    public int a = -1;
    final /* synthetic */ jke b;

    public jkd(jke jkeVar) {
        this.b = jkeVar;
    }

    private final apwv a(int i) {
        return (apwv) this.b.a.getItem(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ajwq b;
        aumx aumxVar;
        if (this.a == i) {
            return;
        }
        apwv a = a(i);
        apww apwwVar = a.g;
        if (apwwVar == null) {
            apwwVar = apww.a;
        }
        if (apwwVar.b == 60487319 && (b = akal.b(this.b.b)) != null) {
            apww apwwVar2 = a.g;
            if (apwwVar2 == null) {
                apwwVar2 = apww.a;
            }
            if (apwwVar2.b == 60487319) {
                aumxVar = (aumx) apwwVar2.c;
            } else {
                aumxVar = aumx.a;
            }
            b.lx(aumxVar, null);
        }
        int i2 = 0;
        while (i2 < this.b.a.getCount()) {
            aopa mo52toBuilder = a(i2).mo52toBuilder();
            boolean z = i2 == i;
            mo52toBuilder.copyOnWrite();
            apwv apwvVar = (apwv) mo52toBuilder.instance;
            apwvVar.b |= 2;
            apwvVar.d = z;
            this.b.a.b(i2, (apwv) mo52toBuilder.mo39build());
            i2++;
        }
        this.a = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
