package com.google.android.apps.gmm.notification.api.intent;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.notification.api.intent.$AutoValue_NotificationIntentConverter_NotificationIntent  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_NotificationIntentConverter_NotificationIntent extends NotificationIntentConverter$NotificationIntent {
    public final dbsg<Integer> a;
    public final auhw b;
    public final Intent c;
    public final dbsg<String> d;
    public final dbsg<String> e;
    public final dbsg<String> f;

    public C$AutoValue_NotificationIntentConverter_NotificationIntent(dbsg<Integer> dbsgVar, auhw auhwVar, Intent intent, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<String> dbsgVar4) {
        if (dbsgVar != null) {
            this.a = dbsgVar;
            if (auhwVar != null) {
                this.b = auhwVar;
                if (intent != null) {
                    this.c = intent;
                    if (dbsgVar2 != null) {
                        this.d = dbsgVar2;
                        if (dbsgVar3 != null) {
                            this.e = dbsgVar3;
                            if (dbsgVar4 != null) {
                                this.f = dbsgVar4;
                                return;
                            }
                            throw new NullPointerException("Null externalContextReference");
                        }
                        throw new NullPointerException("Null ei");
                    }
                    throw new NullPointerException("Null ved");
                }
                throw new NullPointerException("Null intent");
            }
            throw new NullPointerException("Null intentType");
        }
        throw new NullPointerException("Null notificationIdEnumNumber");
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final auhw b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final Intent c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationIntentConverter$NotificationIntent) {
            NotificationIntentConverter$NotificationIntent notificationIntentConverter$NotificationIntent = (NotificationIntentConverter$NotificationIntent) obj;
            if (this.a.equals(notificationIntentConverter$NotificationIntent.a()) && this.b.equals(notificationIntentConverter$NotificationIntent.b()) && this.c.equals(notificationIntentConverter$NotificationIntent.c()) && this.d.equals(notificationIntentConverter$NotificationIntent.d()) && this.e.equals(notificationIntentConverter$NotificationIntent.e()) && this.f.equals(notificationIntentConverter$NotificationIntent.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final dbsg<String> f() {
        return this.f;
    }

    @Override // com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent
    public final auhy g() {
        return new auht(this);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 105 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("NotificationIntent{notificationIdEnumNumber=");
        sb.append(valueOf);
        sb.append(", intentType=");
        sb.append(valueOf2);
        sb.append(", intent=");
        sb.append(valueOf3);
        sb.append(", ved=");
        sb.append(valueOf4);
        sb.append(", ei=");
        sb.append(valueOf5);
        sb.append(", externalContextReference=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}