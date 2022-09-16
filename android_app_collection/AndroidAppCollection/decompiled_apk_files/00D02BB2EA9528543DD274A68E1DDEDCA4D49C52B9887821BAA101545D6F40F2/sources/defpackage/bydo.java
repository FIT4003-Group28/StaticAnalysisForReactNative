package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bydo  reason: default package */
/* loaded from: classes4.dex */
public final class bydo implements bydq {
    private final Context a;
    private final cqat b;

    public bydo(Context context, cqat cqatVar) {
        this.a = context;
        this.b = cqatVar;
    }

    @Override // defpackage.bydq
    public final CharSequence a(byee byeeVar) {
        byed b = byeeVar.b(this.b);
        if (b == null || b.a() == null) {
            return "";
        }
        byeb byebVar = byeb.PERMANENTLY_CLOSED;
        switch (b.a().ordinal()) {
            case 0:
                return this.a.getString(R.string.PLACE_PERMANENTLY_CLOSED);
            case 1:
            case 6:
            case 7:
            case 14:
                return this.a.getString(R.string.CLOSED);
            case 2:
            case 3:
            case 10:
            case 11:
            case 13:
                return this.a.getString(R.string.OPEN);
            case 4:
            case 5:
                return this.a.getString(R.string.CLOSES_SOON);
            case 8:
            case 9:
                return this.a.getString(R.string.OPENS_SOON);
            case 12:
            case 15:
            default:
                return "";
            case 16:
                return this.a.getString(R.string.PLACE_TEMPORARILY_CLOSED);
        }
    }
}
