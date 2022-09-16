package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aano  reason: default package */
/* loaded from: classes.dex */
final class aano extends zer {
    public aano() {
        super("Set<SupportedVideoMimeTypes>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add("video/3gpp");
        hashSet.add("video/mp4");
        hashSet.add("video/webm");
        return Collections.unmodifiableSet(hashSet);
    }
}
