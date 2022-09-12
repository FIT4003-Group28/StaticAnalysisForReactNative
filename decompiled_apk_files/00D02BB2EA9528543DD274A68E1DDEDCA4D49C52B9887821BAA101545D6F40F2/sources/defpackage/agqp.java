package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: agqp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agqp implements cqjb {
    static final cqjb a = new agqp();

    private agqp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqss f;
        agww agwwVar = (agww) cqkpVar;
        dcqe dcqeVar = agqs.a;
        if (agwwVar.e().booleanValue()) {
            f = agwwVar.d();
        } else {
            f = cqta.f();
        }
        return cqrt.g(R.drawable.localstream_transparent_circle_button_background, f);
    }
}
