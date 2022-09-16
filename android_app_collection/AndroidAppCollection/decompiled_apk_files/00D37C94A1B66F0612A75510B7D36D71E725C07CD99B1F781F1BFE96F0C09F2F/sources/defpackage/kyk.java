package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kyk  reason: default package */
/* loaded from: classes3.dex */
final class kyk implements View.OnClickListener {
    final /* synthetic */ kyl a;

    public kyk(kyl kylVar) {
        this.a = kylVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar = (apzg) view.getTag(R.id.tag_endpoint);
        if (apzgVar == null) {
            return;
        }
        this.a.a.c(apzgVar, null);
    }
}
