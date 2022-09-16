package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: abmk  reason: default package */
/* loaded from: classes.dex */
final class abmk implements TextWatcher {
    final /* synthetic */ abmo a;
    private final /* synthetic */ int b;

    public abmk(abmo abmoVar) {
        this.a = abmoVar;
    }

    public abmk(abmo abmoVar, int i) {
        this.b = i;
        this.a = abmoVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b == 0) {
            asrm asrmVar = this.a.q;
            if (asrmVar == null || asrmVar.g.size() == 0) {
                return;
            }
            int size = this.a.q.g.size();
            boolean z = false;
            long j = ((asro) this.a.q.g.get(0)).c;
            long j2 = ((asro) this.a.q.g.get(size - 1)).d;
            long f = this.a.f(String.valueOf(charSequence));
            this.a.p(f);
            abmo abmoVar = this.a;
            abmoVar.l(abmoVar.g(f));
            abmo abmoVar2 = this.a;
            if (f < j || f > j2) {
                z = true;
            }
            abmoVar2.h = z;
            abmoVar2.e();
            return;
        }
        abmo abmoVar3 = this.a;
        abmoVar3.o(abmoVar3.n.b(abmoVar3.d.getText(), this.a.p), this.a.o);
    }
}
