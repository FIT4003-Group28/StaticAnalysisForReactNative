package defpackage;

import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: jt  reason: default package */
/* loaded from: classes.dex */
final class jt {
    public static Shader.TileMode a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
