package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: buaj  reason: default package */
/* loaded from: classes4.dex */
public final class buaj {
    public static URL a(cvjr cvjrVar) {
        try {
            return new URL(cvjrVar.m);
        } catch (MalformedURLException e) {
            bvoo.g(e);
            throw new RuntimeException(e);
        }
    }
}
