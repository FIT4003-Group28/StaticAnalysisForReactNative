package defpackage;

import android.text.util.Linkify;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: jmt  reason: default package */
/* loaded from: classes7.dex */
final class jmt implements Linkify.TransformFilter {
    final /* synthetic */ String a;

    public jmt(String str) {
        this.a = str;
    }

    @Override // android.text.util.Linkify.TransformFilter
    public final String transformUrl(Matcher matcher, String str) {
        return this.a;
    }
}
