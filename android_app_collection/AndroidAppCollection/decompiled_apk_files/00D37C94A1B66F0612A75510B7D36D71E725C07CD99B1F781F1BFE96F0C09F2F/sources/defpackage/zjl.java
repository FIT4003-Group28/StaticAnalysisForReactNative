package defpackage;

import android.net.Uri;
import android.text.Spanned;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
/* compiled from: PG */
/* renamed from: zjl  reason: default package */
/* loaded from: classes4.dex */
public final class zjl {
    public final aath a;

    public zjl(aath aathVar) {
        aathVar.getClass();
        this.a = aathVar;
    }

    public static Track a(apiq apiqVar) {
        arag aragVar;
        arag aragVar2;
        Uri uri;
        avhn avhnVar;
        arag aragVar3;
        arag aragVar4 = null;
        if ((apiqVar.b & 1) != 0) {
            aragVar = apiqVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((apiqVar.b & 2) != 0) {
            aragVar2 = apiqVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        int i = apiqVar.e;
        avvk avvkVar = apiqVar.g;
        if (avvkVar == null) {
            avvkVar = avvk.a;
        }
        if ((avvkVar.b & 1) != 0) {
            avvk avvkVar2 = apiqVar.g;
            if (avvkVar2 == null) {
                avvkVar2 = avvk.a;
            }
            uri = Uri.parse(avvkVar2.c);
        } else {
            uri = null;
        }
        if ((apiqVar.b & 8) != 0) {
            avhn avhnVar2 = apiqVar.f;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        if ((apiqVar.b & 32) != 0) {
            aragVar3 = apiqVar.h;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b3 = ajgl.b(aragVar3);
        if ((apiqVar.b & 64) != 0 && (aragVar4 = apiqVar.i) == null) {
            aragVar4 = arag.a;
        }
        return new Track(b, b2, i, uri, avhnVar, b3, ajgl.b(aragVar4));
    }
}
