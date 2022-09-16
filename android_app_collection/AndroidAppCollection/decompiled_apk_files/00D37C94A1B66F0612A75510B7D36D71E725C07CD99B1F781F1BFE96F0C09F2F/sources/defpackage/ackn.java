package defpackage;

import android.os.Handler;
import android.widget.Toast;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ackn  reason: default package */
/* loaded from: classes.dex */
public final class ackn {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    public final /* synthetic */ ackp c;

    public ackn(ackp ackpVar, String str, int i) {
        this.c = ackpVar;
        this.a = str;
        this.b = i;
    }

    public final void a(int i, aqft aqftVar) {
        if (i != 4) {
            Handler handler = this.c.a;
            final String str = this.a;
            final int i2 = this.b;
            handler.postDelayed(new Runnable() { // from class: ackm
                @Override // java.lang.Runnable
                public final void run() {
                    ackn acknVar = ackn.this;
                    acknVar.c.o(str, i2 - 1);
                }
            }, 400L);
        } else if (aqftVar != null) {
            this.c.s(aqftVar);
        } else {
            Toast.makeText(this.c.rb(), (int) R.string.lc_add_participant_failed, 1).show();
        }
    }
}
