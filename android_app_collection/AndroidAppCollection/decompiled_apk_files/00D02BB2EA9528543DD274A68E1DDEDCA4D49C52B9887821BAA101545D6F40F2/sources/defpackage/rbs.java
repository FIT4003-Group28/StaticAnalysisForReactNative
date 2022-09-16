package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rbs  reason: default package */
/* loaded from: classes7.dex */
public class rbs implements rbe {
    public final ros a;
    public final ex b;
    private final domy c;
    private final domy d;

    public rbs(ros rosVar, ex exVar, domy domyVar, domy domyVar2) {
        this.a = rosVar;
        this.b = exVar;
        this.c = domyVar;
        this.d = domyVar2;
    }

    @Override // defpackage.rbe
    public cjtd a() {
        domy domyVar = domy.UNKNOWN_TRAVEL_MODE;
        int ordinal = this.d.ordinal();
        if (ordinal != 3) {
            if (ordinal == 4) {
                return cjtd.a(dtxl.bg);
            }
            if (ordinal == 5) {
                return cjtd.a(dtxl.bi);
            }
            return cjtd.a(dtxl.bh);
        }
        return cjtd.a(dtxl.bj);
    }

    @Override // defpackage.rbe
    public CharSequence b() {
        return this.b.Rp(R.string.UNSUPPORTED_COMMUTE_DIALOG_TITLE);
    }

    @Override // defpackage.rbe
    public CharSequence c() {
        String Rp;
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = this.b.Rp(R.string.UNSUPPORTED_COMMUTE_DIALOG_MESSAGE);
        domy domyVar = domy.UNKNOWN_TRAVEL_MODE;
        int ordinal = this.c.ordinal();
        if (ordinal != 1) {
            Rp = ordinal != 2 ? "" : this.b.Rp(R.string.TRANSIT_AS_ALTERNATE_UNSUPPORTED_COMMUTE_DIALOG_MESSAGE);
        } else {
            Rp = this.b.Rp(R.string.DRIVING_AS_ALTERNATE_UNSUPPORTED_COMMUTE_DIALOG_MESSAGE);
        }
        charSequenceArr[1] = Rp;
        return TextUtils.join(" ", charSequenceArr);
    }

    @Override // defpackage.rbe
    public CharSequence d() {
        return this.b.Rp(R.string.UNSUPPORTED_COMMUTE_DIALOG_SETTINGS);
    }

    @Override // defpackage.rbe
    public CharSequence e() {
        return this.b.Rp(R.string.UNSUPPORTED_COMMUTE_DIALOG_ACCEPT);
    }

    @Override // defpackage.rbe
    @dzsi
    public cjtd f() {
        return cjtd.a(dtxl.bf);
    }

    @Override // defpackage.rbe
    @dzsi
    public cjtd g() {
        return cjtd.a(dtxl.be);
    }

    @Override // defpackage.rbe
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: rbq
            private final rbs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rbs rbsVar = this.a;
                rbsVar.a.e();
                rbsVar.b.g();
            }
        };
    }

    @Override // defpackage.rbe
    public View.OnClickListener i() {
        return new View.OnClickListener(this) { // from class: rbr
            private final rbs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.g();
            }
        };
    }
}
