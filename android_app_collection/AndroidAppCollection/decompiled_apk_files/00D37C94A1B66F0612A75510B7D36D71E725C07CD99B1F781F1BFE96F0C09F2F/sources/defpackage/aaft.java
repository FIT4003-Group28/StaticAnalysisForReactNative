package defpackage;

import android.text.TextPaint;
import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aaft  reason: default package */
/* loaded from: classes.dex */
public class aaft extends zae {
    private static aafs f;
    private static aafs g;
    private final aafo a;
    public final apzg c;
    private final Map d;
    private final boolean e;

    public aaft(aafo aafoVar, Map map, apzg apzgVar, boolean z) {
        this.a = aafoVar;
        this.d = map;
        this.c = apzgVar;
        this.e = z;
    }

    public static synchronized aafs a(boolean z) {
        synchronized (aaft.class) {
            if (z) {
                if (f == null) {
                    f = b(true);
                }
                return f;
            }
            if (g == null) {
                g = b(false);
            }
            return g;
        }
    }

    private static aafs b(boolean z) {
        return new aafs(z);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.a.c(this.c, this.d);
    }

    @Override // defpackage.zae, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.e);
    }
}
