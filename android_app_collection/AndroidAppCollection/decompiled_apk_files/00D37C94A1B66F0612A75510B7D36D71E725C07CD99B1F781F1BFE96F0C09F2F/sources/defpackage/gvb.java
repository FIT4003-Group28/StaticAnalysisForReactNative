package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gvb  reason: default package */
/* loaded from: classes3.dex */
public final class gvb implements abv {
    final /* synthetic */ gvc a;

    public gvb(gvc gvcVar) {
        this.a = gvcVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        gvc gvcVar = this.a;
        if (!gvcVar.a) {
            gvcVar.a = true;
            gvcVar.lI();
            ShortsCreationActivity shortsCreationActivity = (ShortsCreationActivity) gvcVar;
        }
    }
}
