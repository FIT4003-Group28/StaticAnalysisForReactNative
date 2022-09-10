package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arxc  reason: default package */
/* loaded from: classes2.dex */
public class arxc extends arxg {
    final /* synthetic */ arxa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arxc(Resources resources, ddho ddhoVar, arxa arxaVar) {
        super(2131232915, false, R.string.MEDIA_SKIP_PREVIOUS_CONTENT_DESCRIPTION, R.string.MEDIA_SKIP_PREVIOUS_DISABLED_CONTENT_DESCRIPTION, resources, ddhoVar);
        this.a = arxaVar;
    }

    @Override // defpackage.aryg
    public Boolean a() {
        boolean z = false;
        if (this.a.k() && this.a.r()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aryg
    public cqkl b() {
        this.a.am(arwz.SKIP_NEXT_PREVIOUS);
        this.a.d();
        return cqkl.a;
    }
}
