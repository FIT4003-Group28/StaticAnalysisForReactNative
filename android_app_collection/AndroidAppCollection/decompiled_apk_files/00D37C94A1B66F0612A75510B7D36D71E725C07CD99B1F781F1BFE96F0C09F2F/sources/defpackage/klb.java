package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
/* compiled from: PG */
/* renamed from: klb  reason: default package */
/* loaded from: classes3.dex */
public final class klb {
    public static final mqp a;
    public final acti b;
    public final ViewGroup c;
    public final View d;
    public final kla e;
    public final klf f;
    public final mpu g;
    public kle h;
    public mqf i;
    public mqf j;
    public mpt k;
    private final mqg l;

    static {
        mqo mqoVar = new mqo();
        Integer valueOf = Integer.valueOf((int) R.attr.ytOverlayTextPrimary);
        mqoVar.a = valueOf;
        mqoVar.b = valueOf;
        mqoVar.c = valueOf;
        mqoVar.d = valueOf;
        Integer num = mqoVar.a;
        if (num == null || mqoVar.b == null || mqoVar.c == null || mqoVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (mqoVar.a == null) {
                sb.append(" defaultIconColorRes");
            }
            if (mqoVar.b == null) {
                sb.append(" selectedIconColorRes");
            }
            if (mqoVar.c == null) {
                sb.append(" defaultTextColorRes");
            }
            if (mqoVar.d == null) {
                sb.append(" selectedTextColorRes");
            }
            String valueOf2 = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        }
        a = new mqp(num.intValue(), mqoVar.b.intValue(), mqoVar.c.intValue(), mqoVar.d.intValue());
    }

    public klb(acti actiVar, kla klaVar, klf klfVar, mqg mqgVar, mpu mpuVar, ViewGroup viewGroup, View view) {
        this.b = actiVar;
        this.c = viewGroup;
        this.d = view;
        this.e = klaVar;
        this.f = klfVar;
        this.l = mqgVar;
        this.g = mpuVar;
    }

    public static arbi b(arbm arbmVar) {
        if (arbmVar != null) {
            aunb aunbVar = arbmVar.f;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer)) {
                return null;
            }
            aunb aunbVar2 = arbmVar.f;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (arbi) aunbVar2.qm(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer);
        }
        return null;
    }

    public final mqf a() {
        return this.l.b(this.c, R.layout.fullscreen_engagement_action_bar_button, a);
    }
}
