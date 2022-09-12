package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: vrs  reason: default package */
/* loaded from: classes7.dex */
final class vrs extends cqtd {
    final /* synthetic */ Maneuvers$Maneuver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrs(Object[] objArr, Maneuvers$Maneuver maneuvers$Maneuver) {
        super(objArr);
        this.a = maneuvers$Maneuver;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return vrv.k(this.a);
    }
}
