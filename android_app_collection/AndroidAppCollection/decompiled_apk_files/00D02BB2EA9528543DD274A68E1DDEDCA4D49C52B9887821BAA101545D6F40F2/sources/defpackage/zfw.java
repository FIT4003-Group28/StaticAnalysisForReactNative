package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zfw  reason: default package */
/* loaded from: classes7.dex */
public class zfw extends zfu {
    public final vou c;
    private final amub d;

    public zfw(Activity activity, cqhn cqhnVar, vou vouVar, amub amubVar) {
        super(activity, cqhnVar);
        this.c = vouVar;
        this.d = amubVar;
    }

    @Override // defpackage.zbe
    public zsn b() {
        return new zsn(this) { // from class: zfv
            private final zfw a;

            {
                this.a = this;
            }

            @Override // defpackage.zsn
            public final void a(int i) {
                this.a.c.c(i, false);
            }
        };
    }

    @Override // defpackage.zfu
    protected final boolean d(aldt aldtVar) {
        return aldtVar.a().c != this.d.c;
    }

    @Override // defpackage.zfu
    protected final String e(CharSequence charSequence, CharSequence charSequence2, dbsg<doxc> dbsgVar) {
        if (!dbsgVar.a()) {
            return this.b.getString(R.string.ACCESSIBILITY_ALTERNATE_ROUTE_DESCRIPTION, new Object[]{charSequence, charSequence2});
        }
        doxb doxbVar = doxb.TYPE_UNKNOWN;
        doxb b = doxb.b(dbsgVar.b().b);
        if (b == null) {
            b = doxb.TYPE_UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            return this.b.getString(R.string.ACCESSIBILITY_ALTERNATE_ROUTE_HAS_TOLLS_DESCRIPTION, new Object[]{charSequence, charSequence2});
        }
        if (ordinal == 2) {
            return this.b.getString(R.string.ACCESSIBILITY_ALTERNATE_ROUTE_NO_TOLLS_DESCRIPTION, new Object[]{charSequence, charSequence2});
        }
        return this.b.getString(R.string.ACCESSIBILITY_ALTERNATE_ROUTE_DESCRIPTION, new Object[]{charSequence, charSequence2});
    }
}
