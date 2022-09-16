package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.widget.ImageView;
import java.util.Map;
/* compiled from: PG */
/* renamed from: sxm  reason: default package */
/* loaded from: classes4.dex */
public final class sxm implements teh {
    private final Map a;
    private final Map b;
    private final teb c;

    public sxm(Map map, Map map2, teb tebVar) {
        amum amumVar = new amum();
        for (Map.Entry entry : ((amup) map).entrySet()) {
            ((teg) entry.getValue()).c();
            amumVar.f(154604025, (teg) entry.getValue());
        }
        this.a = amumVar.b();
        amum amumVar2 = new amum();
        for (Map.Entry entry2 : ((amup) map2).entrySet()) {
            amumVar2.f(Integer.valueOf(((tef) ((Pair) entry2.getValue()).first).b().a()), (Pair) entry2.getValue());
        }
        this.b = amumVar2.b();
        this.c = tebVar;
    }

    @Override // defpackage.teh
    public final Drawable a(aodt aodtVar, Bitmap bitmap, ImageView.ScaleType scaleType) {
        if (aodtVar.U() == 1) {
            teg tegVar = (teg) this.a.get(Integer.valueOf(aodtVar.T()));
            if (tegVar == null) {
                teb tebVar = this.c;
                int T = aodtVar.T();
                StringBuilder sb = new StringBuilder(88);
                sb.append("Unknown Flatbuffer extension in ImageProcessorExtensionResolverExtension id: ");
                sb.append(T);
                tebVar.b(24, sb.toString());
                return null;
            }
            return tegVar.a(tegVar.b(aodtVar.V()), bitmap, scaleType);
        } else if (aodtVar.U() == 2) {
            Pair pair = (Pair) this.b.get(Integer.valueOf(aodtVar.T()));
            if (pair == null) {
                teb tebVar2 = this.c;
                int T2 = aodtVar.T();
                StringBuilder sb2 = new StringBuilder(82);
                sb2.append("ImageProcessorExtensionResolver: Unknown PB image processor extension: ");
                sb2.append(T2);
                tebVar2.b(24, sb2.toString());
                return null;
            }
            try {
                return ((tef) pair.first).a(tgo.i(aodtVar.V(), (aorb) pair.second), bitmap, scaleType);
            } catch (aopx e) {
                teb tebVar3 = this.c;
                int T3 = aodtVar.T();
                StringBuilder sb3 = new StringBuilder(106);
                sb3.append("Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver. Extension id: ");
                sb3.append(T3);
                tebVar3.d(24, sb3.toString(), e);
                return null;
            }
        } else {
            teb tebVar4 = this.c;
            int T4 = aodtVar.T();
            StringBuilder sb4 = new StringBuilder(75);
            sb4.append("ImageProcessorExtensionResolver: extension with unknown format: ");
            sb4.append(T4);
            tebVar4.b(24, sb4.toString());
            return null;
        }
    }
}
