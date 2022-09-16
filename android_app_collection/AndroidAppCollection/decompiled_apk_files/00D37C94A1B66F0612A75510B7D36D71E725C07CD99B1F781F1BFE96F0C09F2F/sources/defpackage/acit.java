package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: acit  reason: default package */
/* loaded from: classes.dex */
final class acit implements TextWatcher {
    final /* synthetic */ acix a;

    public acit(acix acixVar) {
        this.a = acixVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        zag.o(this.a.d, !TextUtils.isEmpty(charSequence));
        final acix acixVar = this.a;
        if (charSequence.length() > 0) {
            final String charSequence2 = charSequence.toString();
            acixVar.g = charSequence.toString();
            abzb abzbVar = acixVar.a;
            abza abzaVar = new abza(abzbVar.e, abzbVar.a.c(), charSequence.toString());
            abzaVar.i();
            final ankt b = abzbVar.c.b(abzaVar, abzbVar.b);
            b.qY(new Runnable() { // from class: acir
                @Override // java.lang.Runnable
                public final void run() {
                    acix acixVar2 = acix.this;
                    String str = charSequence2;
                    ankt anktVar = b;
                    if (!TextUtils.equals(str, acixVar2.g)) {
                        return;
                    }
                    try {
                        arbv arbvVar = (arbv) anktVar.get();
                        if (arbvVar.c.size() != 0) {
                            aciw aciwVar = acixVar2.e;
                            arbt[] arbtVarArr = (arbt[]) arbvVar.c.toArray(new arbt[0]);
                            aciwVar.d.clear();
                            if (arbtVarArr != null) {
                                for (arbt arbtVar : arbtVarArr) {
                                    aciwVar.d.add(arbtVar);
                                }
                            }
                            acixVar2.c.setVisibility(0);
                        } else {
                            acixVar2.e.w();
                            acixVar2.c.setVisibility(8);
                        }
                        acixVar2.e.mr();
                        acixVar2.c.ab(0);
                    } catch (InterruptedException | ExecutionException e) {
                        zep.d("Error getting game titles", e);
                    }
                }
            }, acixVar.f);
            return;
        }
        acixVar.g = null;
        acixVar.e.w();
        acixVar.e.mr();
        acixVar.c.setVisibility(8);
    }
}
