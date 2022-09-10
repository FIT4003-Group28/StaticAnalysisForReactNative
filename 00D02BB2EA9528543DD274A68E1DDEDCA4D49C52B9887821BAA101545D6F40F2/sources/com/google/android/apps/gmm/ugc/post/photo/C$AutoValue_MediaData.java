package com.google.android.apps.gmm.ugc.post.photo;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.ugc.post.photo.$AutoValue_MediaData  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_MediaData extends MediaData {
    public final Uri a;
    public final dbsg<String> b;
    public final dbsg<String> c;
    public final dbsg<Integer> d;
    public final dbsg<Integer> e;
    public final dbsg<Integer> f;
    public final int g;

    public C$AutoValue_MediaData(Uri uri, dbsg<String> dbsgVar, int i, dbsg<String> dbsgVar2, dbsg<Integer> dbsgVar3, dbsg<Integer> dbsgVar4, dbsg<Integer> dbsgVar5) {
        if (uri != null) {
            this.a = uri;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                if (i != 0) {
                    this.g = i;
                    if (dbsgVar2 != null) {
                        this.c = dbsgVar2;
                        if (dbsgVar3 != null) {
                            this.d = dbsgVar3;
                            if (dbsgVar4 != null) {
                                this.e = dbsgVar4;
                                if (dbsgVar5 != null) {
                                    this.f = dbsgVar5;
                                    return;
                                }
                                throw new NullPointerException("Null orientation");
                            }
                            throw new NullPointerException("Null rawHeightInPxs");
                        }
                        throw new NullPointerException("Null rawWidthInPxs");
                    }
                    throw new NullPointerException("Null caption");
                }
                throw new NullPointerException("Null source");
            }
            throw new NullPointerException("Null mediaKey");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final Uri a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final dbsg<Integer> d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final dbsg<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaData) {
            MediaData mediaData = (MediaData) obj;
            if (this.a.equals(mediaData.a()) && this.b.equals(mediaData.b()) && this.g == mediaData.h() && this.c.equals(mediaData.c()) && this.d.equals(mediaData.d()) && this.e.equals(mediaData.e()) && this.f.equals(mediaData.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final dbsg<Integer> f() {
        return this.f;
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final cdyf g() {
        return new cdue(this);
    }

    @Override // com.google.android.apps.gmm.ugc.post.photo.MediaData
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String a = cdyg.a(this.g);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = a.length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("MediaData{uri=");
        sb.append(valueOf);
        sb.append(", mediaKey=");
        sb.append(valueOf2);
        sb.append(", source=");
        sb.append(a);
        sb.append(", caption=");
        sb.append(valueOf3);
        sb.append(", rawWidthInPxs=");
        sb.append(valueOf4);
        sb.append(", rawHeightInPxs=");
        sb.append(valueOf5);
        sb.append(", orientation=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
