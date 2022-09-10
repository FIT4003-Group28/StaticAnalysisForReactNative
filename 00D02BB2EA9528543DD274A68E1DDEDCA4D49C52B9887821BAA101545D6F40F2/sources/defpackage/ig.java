package defpackage;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ig  reason: default package */
/* loaded from: classes6.dex */
public final class ig extends ih {
    public akj b;
    public CharSequence c;
    private Boolean i;
    public final List<C0002if> a = new ArrayList();
    private final List<C0002if> h = new ArrayList();

    public ig() {
    }

    private final CharSequence l(C0002if c0002if) {
        alp a = alp.a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        akj akjVar = c0002if.b;
        CharSequence charSequence = "";
        CharSequence charSequence2 = akjVar == null ? charSequence : akjVar.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = this.b.a;
            int i2 = this.d.B;
            if (i2 != 0) {
                i = i2;
            }
        }
        CharSequence c = a.c(charSequence2);
        spannableStringBuilder.append(c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = c0002if.a;
        if (charSequence3 != null) {
            charSequence = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append(a.c(charSequence));
        return spannableStringBuilder;
    }

    @Override // defpackage.ih
    protected final String a() {
        return "android.support.v4.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.ih
    public final void b(hw hwVar) {
        boolean booleanValue;
        C0002if c0002if;
        List<C0002if> list;
        CharSequence charSequence;
        CharSequence charSequence2;
        Notification.MessagingStyle messagingStyle;
        ib ibVar = this.d;
        boolean z = true;
        if (ibVar == null || ibVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            }
            booleanValue = false;
        } else {
            if (this.c != null) {
                booleanValue = true;
            }
            booleanValue = false;
        }
        i(booleanValue);
        if (Build.VERSION.SDK_INT < 24) {
            int size = this.a.size();
            while (true) {
                size--;
                if (size >= 0) {
                    c0002if = this.a.get(size);
                    akj akjVar = c0002if.b;
                    if (akjVar != null && !TextUtils.isEmpty(akjVar.a)) {
                        break;
                    }
                } else if (!this.a.isEmpty()) {
                    c0002if = this.a.get(list.size() - 1);
                } else {
                    c0002if = null;
                }
            }
            if (this.c != null && this.i.booleanValue()) {
                ((ii) hwVar).a.setContentTitle(this.c);
            } else if (c0002if != null) {
                ii iiVar = (ii) hwVar;
                iiVar.a.setContentTitle("");
                akj akjVar2 = c0002if.b;
                if (akjVar2 != null) {
                    iiVar.a.setContentTitle(akjVar2.a);
                }
            }
            if (c0002if != null) {
                Notification.Builder builder = ((ii) hwVar).a;
                if (this.c != null) {
                    charSequence2 = l(c0002if);
                } else {
                    charSequence2 = c0002if.a;
                }
                builder.setContentText(charSequence2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.c == null) {
                int size2 = this.a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        z = false;
                        break;
                    }
                    akj akjVar3 = this.a.get(size2).b;
                    if (akjVar3 != null && akjVar3.a == null) {
                        break;
                    }
                }
            }
            int size3 = this.a.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    C0002if c0002if2 = this.a.get(size3);
                    if (z) {
                        charSequence = l(c0002if2);
                    } else {
                        charSequence = c0002if2.a;
                    }
                    if (size3 != this.a.size() - 1) {
                        spannableStringBuilder.insert(0, (CharSequence) "\n");
                    }
                    spannableStringBuilder.insert(0, charSequence);
                } else {
                    new Notification.BigTextStyle(((ii) hwVar).a).setBigContentTitle(null).bigText(spannableStringBuilder);
                    return;
                }
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle = new Notification.MessagingStyle(this.b.c());
            } else {
                messagingStyle = new Notification.MessagingStyle(this.b.a);
            }
            for (C0002if c0002if3 : this.a) {
                messagingStyle.addMessage(c0002if3.c());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (C0002if c0002if4 : this.h) {
                    messagingStyle.addHistoricMessage(c0002if4.c());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.c);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.i.booleanValue());
            }
            messagingStyle.setBuilder(((ii) hwVar).a);
        }
    }

    @Override // defpackage.ih
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.b.a);
        bundle.putBundle("android.messagingStyleUser", this.b.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.c);
        if (this.c != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.c);
        }
        if (!this.a.isEmpty()) {
            bundle.putParcelableArray("android.messages", C0002if.a(this.a));
        }
        if (!this.h.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C0002if.a(this.h));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // defpackage.ih
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.a.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.b = akj.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            aki akiVar = new aki();
            akiVar.a = bundle.getString("android.selfDisplayName");
            this.b = akiVar.a();
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.c = charSequence;
        if (charSequence == null) {
            this.c = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            this.a.addAll(C0002if.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.h.addAll(C0002if.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final void h(C0002if c0002if) {
        if (c0002if != null) {
            this.a.add(c0002if);
            if (this.a.size() <= 25) {
                return;
            }
            this.a.remove(0);
        }
    }

    public final void i(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public ig(akj akjVar) {
        if (!TextUtils.isEmpty(akjVar.a)) {
            this.b = akjVar;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
