package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* compiled from: PG */
/* renamed from: agu  reason: default package */
/* loaded from: classes.dex */
public abstract class agu {
    public Random b = new Random();
    public final Map<Integer, String> c = new HashMap();
    public final Map<String, Integer> d = new HashMap();
    public final Map<String, agt> e = new HashMap();
    public final transient Map<String, ags<?>> f = new HashMap();
    public final Map<String, Object> g = new HashMap();
    public final Bundle h = new Bundle();

    public abstract <I, O> void a(int i, agz<I, O> agzVar, I i2);

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> agq<I> b(String str, agz<I, O> agzVar, agp<O> agpVar) {
        int i;
        Integer num = this.d.get(str);
        if (num != null) {
            i = num.intValue();
        } else {
            int nextInt = this.b.nextInt(2147418112);
            while (true) {
                i = nextInt + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                if (!this.c.containsKey(Integer.valueOf(i))) {
                    break;
                }
                nextInt = this.b.nextInt(2147418112);
            }
            d(i, str);
        }
        this.f.put(str, new ags<>(agpVar, agzVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            agpVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.h.getParcelable(str);
        if (activityResult != null) {
            this.h.remove(str);
            agpVar.a(agzVar.a(activityResult.a, activityResult.b));
        }
        return new agr(this, i, agzVar, str);
    }

    public final boolean c(int i, int i2, Intent intent) {
        agp<?> agpVar;
        String str = this.c.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ags<?> agsVar = this.f.get(str);
        if (agsVar == null || (agpVar = agsVar.a) == null) {
            this.g.remove(str);
            this.h.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        agpVar.a(agsVar.b.a(i2, intent));
        return true;
    }

    public final void d(int i, String str) {
        Map<Integer, String> map = this.c;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.d.put(str, valueOf);
    }
}
