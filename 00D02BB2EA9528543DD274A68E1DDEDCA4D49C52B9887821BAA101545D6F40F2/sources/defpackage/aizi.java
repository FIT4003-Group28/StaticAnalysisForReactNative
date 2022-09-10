package defpackage;

import android.widget.CompoundButton;
/* renamed from: aizi  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aizi implements cqlc {
    static final cqlc a = new aizi();

    private aizi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final aizs aizsVar = (aizs) cqkpVar;
        int i = aizr.a;
        return new CompoundButton.OnCheckedChangeListener(aizsVar) { // from class: aizh
            private final aizs a;

            {
                this.a = aizsVar;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                aizs aizsVar2 = this.a;
                int i2 = aizr.a;
                aizsVar2.b(z);
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
