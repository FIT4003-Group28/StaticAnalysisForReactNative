package defpackage;

import android.content.DialogInterface;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.google.android.apps.gmm.shared.util.IncognitoSafeURLSpan;
import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dfk  reason: default package */
/* loaded from: classes6.dex */
public final class dfk {
    public final gga a;
    public final dehq b;
    public final dxio<ache> c;
    public final cqat d;
    public final cqkj e;
    private final Map<czh, dzsj<czl<?>>> f;

    public dfk(gga ggaVar, dxio<ache> dxioVar, dehq dehqVar, Map<czh, dzsj<czl<?>>> map, cqat cqatVar, cqkj cqkjVar) {
        this.a = ggaVar;
        this.b = dehqVar;
        this.f = map;
        this.c = dxioVar;
        this.d = cqatVar;
        this.e = cqkjVar;
    }

    public final void a(final czh czhVar, @dzsi final achg achgVar, final boolean z, @dzsi final String str, final dbsg<Long> dbsgVar, final Runnable runnable) {
        achc achcVar;
        czh czhVar2 = czh.WALKING_NAVIGATION;
        int ordinal = czhVar.ordinal();
        if (ordinal == 0) {
            achcVar = achc.AR_WALKING;
        } else if (ordinal == 1) {
            achcVar = achc.AR_LIGHTHOUSE;
        } else if (ordinal == 2) {
            achcVar = achc.AR_PLACE_DISCOVERY;
        } else if (ordinal == 3) {
            achcVar = achc.AR_CALIBRATOR;
        } else {
            String valueOf = String.valueOf(czhVar.name());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Ar Feedback has not been configured for ".concat(valueOf) : new String("Ar Feedback has not been configured for "));
        }
        final achc achcVar2 = achcVar;
        iii iiiVar = new iii();
        iiiVar.b = this.a.getString(R.string.ARWN_LOCATION_ERROR_PROMPT);
        iiiVar.d(this.a.getString(R.string.YES_BUTTON), new View.OnClickListener(this, czhVar, achcVar2, achgVar, z, str, dbsgVar, runnable) { // from class: dfb
            private final dfk a;
            private final czh b;
            private final achc c;
            private final achg d;
            private final boolean e;
            private final String f;
            private final dbsg g;
            private final Runnable h;

            {
                this.a = this;
                this.b = czhVar;
                this.c = achcVar2;
                this.d = achgVar;
                this.e = z;
                this.f = str;
                this.g = dbsgVar;
                this.h = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final dfk dfkVar = this.a;
                final czh czhVar3 = this.b;
                final achc achcVar3 = this.c;
                final achg achgVar2 = this.d;
                final boolean z2 = this.e;
                final String str2 = this.f;
                final dbsg dbsgVar2 = this.g;
                final Runnable runnable2 = this.h;
                CharSequence a = IncognitoSafeURLSpan.a(Html.fromHtml(dfkVar.a.getString(R.string.ARWN_LOCATION_LOGS_REQUEST)));
                iii iiiVar2 = new iii();
                iiiVar2.b = a;
                iiiVar2.d = LinkMovementMethod.getInstance();
                iiiVar2.d(dfkVar.a.getString(R.string.ARWN_LOCATION_LOGS_REQUEST_POSITIVE_RESPONSE), new View.OnClickListener(dfkVar, czhVar3, achcVar3, achgVar2, z2, str2, dbsgVar2) { // from class: dfe
                    private final dfk a;
                    private final czh b;
                    private final achc c;
                    private final achg d;
                    private final boolean e;
                    private final String f;
                    private final dbsg g;

                    {
                        this.a = dfkVar;
                        this.b = czhVar3;
                        this.c = achcVar3;
                        this.d = achgVar2;
                        this.e = z2;
                        this.f = str2;
                        this.g = dbsgVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.b(this.b, this.c, this.d, this.e, this.f, true, this.g);
                    }
                }, null);
                iiiVar2.c(dfkVar.a.getString(R.string.ARWN_LOCATION_LOGS_REQUEST_NEGATIVE_RESPONSE), new View.OnClickListener(runnable2) { // from class: dff
                    private final Runnable a;

                    {
                        this.a = runnable2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.run();
                    }
                }, null);
                iiiVar2.c = new DialogInterface.OnCancelListener(runnable2) { // from class: dfg
                    private final Runnable a;

                    {
                        this.a = runnable2;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.a.run();
                    }
                };
                iiiVar2.a(dfkVar.a, dfkVar.e).k();
            }
        }, null);
        iiiVar.c(this.a.getString(R.string.ARWN_LOCATION_ERROR_NO), new View.OnClickListener(this, czhVar, achcVar2, achgVar, z, str, dbsgVar) { // from class: dfc
            private final dfk a;
            private final czh b;
            private final achc c;
            private final achg d;
            private final boolean e;
            private final String f;
            private final dbsg g;

            {
                this.a = this;
                this.b = czhVar;
                this.c = achcVar2;
                this.d = achgVar;
                this.e = z;
                this.f = str;
                this.g = dbsgVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b(this.b, this.c, this.d, this.e, this.f, false, this.g);
            }
        }, null);
        iiiVar.c = new DialogInterface.OnCancelListener(runnable) { // from class: dfd
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.run();
            }
        };
        iiiVar.a(this.a, this.e).k();
    }

    public final void b(czh czhVar, achc achcVar, @dzsi achg achgVar, boolean z, @dzsi String str, boolean z2, dbsg<Long> dbsgVar) {
        acgz b = achb.b();
        if (str != null) {
            b.c("GeoAR Session ID", str);
            b.c("GeoAR User Logs Consent", Boolean.toString(z2));
        }
        b.c("Using Arlo", Boolean.toString(z));
        dzsj<czl<?>> dzsjVar = this.f.get(czhVar);
        dbsk.s(dzsjVar);
        deha.q(dzsjVar.a().g(), new dfj(this, b, dbsgVar, achgVar, achcVar), this.b);
    }
}
