package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aotc  reason: default package */
/* loaded from: classes2.dex */
class aotc implements baeh {
    final /* synthetic */ aotd a;

    public aotc(aotd aotdVar) {
        this.a = aotdVar;
    }

    @Override // defpackage.baeh
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: aotb
            private final aotc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a.a.D(new aotn());
            }
        };
    }

    @Override // defpackage.baeh
    public cjtd b() {
        return cjtd.a(dtyc.ai);
    }

    @Override // defpackage.baeh
    public CharSequence c() {
        return this.a.a.a.getString(R.string.INFO_BUTTON_CONTENT_DESCRIPTION);
    }
}
