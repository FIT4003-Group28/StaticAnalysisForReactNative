package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: abeh  reason: default package */
/* loaded from: classes2.dex */
final class abeh implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ abei a;

    public abeh(abei abeiVar) {
        this.a = abeiVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        abei abeiVar = this.a;
        if (i == abeiVar.e) {
            return;
        }
        abeiVar.e = i;
        abdz abdzVar = abeiVar.a;
        dqpm dqpmVar = abeiVar.d.get(i);
        abei abeiVar2 = this.a;
        String str = abeiVar2.b;
        dqqa dqqaVar = abeiVar2.c;
        abeiVar.f = abdzVar.a(dqpmVar, Integer.MAX_VALUE, str, dqqaVar.f, dqqaVar.e, Collections.unmodifiableMap(dqqaVar.d));
        cqkx.p(this.a);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
