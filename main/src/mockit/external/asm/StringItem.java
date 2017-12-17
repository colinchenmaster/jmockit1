package mockit.external.asm;

import javax.annotation.*;

final class StringItem extends Item
{
   @Nonnull String strVal;
   @Nonnegative int innerClassIndex;

   StringItem(@Nonnegative int index) {
      super(index);
      strVal = "";
   }

   StringItem(@Nonnegative int index, @Nonnull StringItem item) {
      super(index, item);
      strVal = item.strVal;
   }

   /**
    * Sets this string item value.
    */
   void set(int type, @Nonnull String strVal) {
      this.type = type;
      this.strVal = strVal;
      setHashCode(strVal.hashCode());
   }

   @Override
   boolean isEqualTo(@Nonnull Item item) {
      return ((StringItem) item).strVal.equals(strVal);
   }
}
