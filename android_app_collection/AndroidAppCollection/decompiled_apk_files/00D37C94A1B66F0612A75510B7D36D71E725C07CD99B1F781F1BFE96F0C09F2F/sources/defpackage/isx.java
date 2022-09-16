package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.SetAppThemeCommandOuterClass$SetAppThemeCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: isx  reason: default package */
/* loaded from: classes3.dex */
public final class isx implements aafl {
    private final Activity a;
    private final gfu b;

    public isx(Activity activity, gfu gfuVar) {
        this.a = activity;
        this.b = gfuVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand)) {
            throw new aafy("Expected a SetAppThemeCommand, but did not find one.");
        }
        gfs a = this.b.a();
        int bj = awwc.bj(((SetAppThemeCommandOuterClass$SetAppThemeCommand) apzgVar.qm(SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand)).b);
        if (bj == 0) {
            bj = 1;
        }
        if (bj - 1 == 2) {
            if (a == gfs.DARK) {
                return;
            }
            this.b.d(gfs.DARK);
        } else if (a == gfs.LIGHT) {
            return;
        } else {
            this.b.d(gfs.LIGHT);
        }
        this.a.recreate();
    }
}
