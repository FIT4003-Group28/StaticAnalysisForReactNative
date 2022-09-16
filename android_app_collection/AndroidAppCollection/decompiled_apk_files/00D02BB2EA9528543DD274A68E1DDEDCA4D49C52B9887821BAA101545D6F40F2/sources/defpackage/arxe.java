package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arxe  reason: default package */
/* loaded from: classes2.dex */
public class arxe extends arxg {
    final /* synthetic */ arxa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arxe(int i, Resources resources, ddho ddhoVar, arxa arxaVar) {
        super(i, true, R.string.MEDIA_REWIND_CONTENT_DESCRIPTION, R.string.MEDIA_REWIND_DISABLED_CONTENT_DESCRIPTION, resources, ddhoVar);
        this.a = arxaVar;
    }

    @Override // defpackage.aryg
    public Boolean a() {
        boolean z = false;
        if (this.a.n() && this.a.r()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aryg
    public cqkl b() {
        this.a.am(arwz.FAST_FORWARD_REWIND);
        this.a.g();
        return cqkl.a;
    }
}
