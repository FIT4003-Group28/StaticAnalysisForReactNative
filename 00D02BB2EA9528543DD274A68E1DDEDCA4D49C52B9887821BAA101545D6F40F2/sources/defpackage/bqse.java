package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.maps.R;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqse  reason: default package */
/* loaded from: classes4.dex */
public class bqse {
    public static final LabelOptions a = new LabelOptions(5);
    public final Executor b;
    public final bbtt c;
    public final dxio<cpfz> e;
    public final bqsh f;
    public final String g;
    private final Executor i;
    public final Object d = new Object();
    public final Map<Uri, deho<String>> h = new HashMap();

    public bqse(Activity activity, Executor executor, Executor executor2, bbtt bbttVar, dxio<cpfz> dxioVar, btvo btvoVar) {
        this.g = activity.getResources().getString(R.string.CAPTION_HINT_DEFAULT);
        this.i = executor;
        this.b = executor2;
        this.c = bbttVar;
        this.e = dxioVar;
        if (!btvoVar.getUgcParameters().M().b || !dxioVar.a().c()) {
            this.f = new bqsh();
            return;
        }
        bqsh bqshVar = new bqsh();
        bqshVar.a("/m/0663v", 0.75f, activity.getResources().getString(R.string.CAPTION_HINT_PIZZA));
        String string = activity.getResources().getString(R.string.CAPTION_HINT_DINING);
        bqshVar.a("/m/02wbm", 0.9f, string);
        bqshVar.a("/m/01ykh", 0.9f, string);
        bqshVar.a("/m/0krfg", 0.9f, string);
        bqshVar.a("/m/04brg2", 0.7f, string);
        bqshVar.a("/m/07ptj3n", 0.7f, string);
        bqshVar.a("/m/02_58j", 0.8f, activity.getResources().getString(R.string.CAPTION_HINT_ROOM));
        bqshVar.a("/m/06ht1", 0.7f, activity.getResources().getString(R.string.CAPTION_HINT_INTERIOR));
        bqshVar.a("/m/01jwgf", 0.5f, activity.getResources().getString(R.string.CAPTION_HINT_PRODUCT));
        bqshVar.a("/m/01b2w5", 0.7f, activity.getResources().getString(R.string.CAPTION_HINT_EVENING));
        bqshVar.a("/m/01bqvp", 0.7f, activity.getResources().getString(R.string.CAPTION_HINT_VIEW));
        this.f = bqshVar;
    }

    public final void a(final bqux bquxVar, final Uri uri, final String str) {
        this.i.execute(new Runnable(bquxVar, uri, str) { // from class: bqsd
            private final Uri a;
            private final String b;
            private final bqux c;

            {
                this.c = bquxVar;
                this.a = uri;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqux bquxVar2 = this.c;
                Uri uri2 = this.a;
                String str2 = this.b;
                bqvc bqvcVar = bquxVar2.a;
                bbtm bbtmVar = bqvcVar.b;
                if (bbtmVar != null && uri2.equals(bbtmVar.z())) {
                    bqvcVar.c = str2;
                    cqkx.p(bqvcVar);
                }
            }
        });
    }
}
