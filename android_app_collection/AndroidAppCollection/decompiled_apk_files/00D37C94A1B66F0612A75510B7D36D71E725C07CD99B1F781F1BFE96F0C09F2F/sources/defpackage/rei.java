package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.cardboard.sdk.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: rei  reason: default package */
/* loaded from: classes4.dex */
final class rei extends reo {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ rek c;
    final /* synthetic */ tzh d;

    public rei(Intent intent, WeakReference weakReference, rek rekVar, tzh tzhVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = intent;
        this.b = weakReference;
        this.c = rekVar;
        this.d = tzhVar;
    }

    @Override // defpackage.reo
    public final void c(GoogleHelp googleHelp) {
        SafeParcelable safeParcelable;
        ViewGroup viewGroup;
        long nanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", nanoTime);
        final Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.l(rel.a);
            return;
        }
        if (this.d != null) {
            Context applicationContext = activity.getApplicationContext();
            tzh tzhVar = this.d;
            if (tzhVar != null) {
                googleHelp.B = true;
                qnm.p(new rea(applicationContext, googleHelp, nanoTime));
                qnm.p(new reb(applicationContext, googleHelp, tzhVar, nanoTime, null, null, null));
            }
        }
        googleHelp.z = qrq.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = charSequence;
        }
        rek rekVar = this.c;
        final Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            if (byteArrayExtra == null) {
                safeParcelable = null;
            } else {
                qnm.b(creator);
                int length = byteArrayExtra.length;
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, length);
                obtain.setDataPosition(0);
                safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
                obtain.recycle();
            }
            InProductHelp inProductHelp = (InProductHelp) safeParcelable;
            inProductHelp.a = googleHelp;
            Parcel obtain2 = Parcel.obtain();
            qxv.b(inProductHelp, obtain2, 0);
            byte[] marshall = obtain2.marshall();
            obtain2.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
        }
        new rfm(Looper.getMainLooper()).post(new Runnable() { // from class: rec
            @Override // java.lang.Runnable
            public final void run() {
                activity.startActivityForResult(intent, R.styleable.AppCompatTheme_windowFixedWidthMinor);
            }
        });
        rekVar.n(Status.a);
    }
}
