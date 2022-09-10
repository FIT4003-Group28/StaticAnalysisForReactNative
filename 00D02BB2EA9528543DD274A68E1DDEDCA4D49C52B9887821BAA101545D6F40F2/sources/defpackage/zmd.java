package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zmd  reason: default package */
/* loaded from: classes7.dex */
public class zmd implements zcx {
    private final Context a;
    private final zcw b;

    public zmd(Context context, zcw zcwVar) {
        this.a = context;
        this.b = zcwVar;
    }

    @Override // defpackage.zcx
    public CharSequence a() {
        return this.a.getText(R.string.DIRECTIONS_TAXI_PARKING_ALTERNATIVE_TITLE);
    }

    @Override // defpackage.zcx
    public CharSequence b() {
        return this.a.getText(R.string.DIRECTIONS_TAXI_PARKING_ALTERNATIVE_BUTTON);
    }

    @Override // defpackage.zcx
    public cqkl c(cjqm cjqmVar) {
        this.b.A(cjqmVar);
        return cqkl.a;
    }
}
