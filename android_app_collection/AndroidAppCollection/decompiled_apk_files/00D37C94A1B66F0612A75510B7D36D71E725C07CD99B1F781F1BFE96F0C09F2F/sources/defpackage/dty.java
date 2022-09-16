package defpackage;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: dty  reason: default package */
/* loaded from: classes3.dex */
public final class dty extends dux {
    public dty(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "1gMUWiGv0sK0cgryPlvo9jLAJHDCo5NgpzMHcm+jKGIJTp8g1qGgs5dX6atCDfWF", "5ZmmXYdlnDy4dpTQ7gtKfp8zHInfyJK95cOVqvDwe+s=", aopaVar, i, 49);
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        int i = 2;
        dnwVar.K = 2;
        dnwVar.c |= 2048;
        try {
            boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
            aopa aopaVar2 = this.g;
            if (true != booleanValue) {
                i = 1;
            }
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            dnwVar3.K = i - 1;
            dnwVar3.c |= 2048;
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
