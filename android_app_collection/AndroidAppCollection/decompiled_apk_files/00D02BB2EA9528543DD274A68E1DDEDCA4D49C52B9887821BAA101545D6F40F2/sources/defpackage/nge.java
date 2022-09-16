package defpackage;

import android.view.View;
import android.widget.CompoundButton;
/* renamed from: nge  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class nge {
    public static View.OnClickListener a(final ngh nghVar) {
        return new View.OnClickListener(nghVar) { // from class: ngf
            private final ngh a;

            {
                this.a = nghVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ngh nghVar2 = this.a;
                nghVar2.c(Boolean.valueOf(!nghVar2.b().booleanValue()));
            }
        };
    }

    public static CompoundButton.OnCheckedChangeListener b(final ngh nghVar) {
        return new CompoundButton.OnCheckedChangeListener(nghVar) { // from class: ngg
            private final ngh a;

            {
                this.a = nghVar;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ngh nghVar2 = this.a;
                if (z == nghVar2.b().booleanValue()) {
                    return;
                }
                nghVar2.c(Boolean.valueOf(z));
            }
        };
    }
}
