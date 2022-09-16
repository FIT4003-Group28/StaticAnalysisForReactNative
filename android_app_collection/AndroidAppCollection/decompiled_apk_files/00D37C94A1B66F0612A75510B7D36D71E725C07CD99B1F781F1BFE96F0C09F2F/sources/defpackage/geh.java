package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: geh  reason: default package */
/* loaded from: classes3.dex */
public final class geh extends jo {
    final /* synthetic */ gej b;

    public geh(gej gejVar) {
        this.b = gejVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        boolean z = true;
        mhVar.p(true);
        if (this.b.b.getSelectedItem() != ((gei) view.getTag()).g) {
            z = false;
        }
        mhVar.q(z);
        String charSequence = ((TextView) view.findViewById(R.id.label)).getText().toString();
        String charSequence2 = ((TextView) view.findViewById(R.id.description)).getText().toString();
        String valueOf = String.valueOf(charSequence);
        String valueOf2 = String.valueOf(charSequence2);
        mhVar.v(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
